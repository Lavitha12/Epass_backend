package com.example.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/")
public class ProofFileController 
{
public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";
	
	@RequestMapping("/files")
	public String uploadpage(Model model)
	{
		return "view";		
	}
	
	@RequestMapping("/upload")
	public String upload(Model model,@RequestParam("files") MultipartFile[] files)
	{
		StringBuilder fileName = new StringBuilder();
		for(MultipartFile file : files)
		{
			Path fileNameandPath = Paths.get(uploadDirectory, file.getOriginalFilename());
			fileName.append(file.getOriginalFilename()+" ");
			try
			{
				Files.write(fileNameandPath, file.getBytes());
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		model.addAttribute("msg","Sucessfully uploaded files"+fileName.toString());
		return "statusview";
	}
	
}
