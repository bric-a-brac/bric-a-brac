package website.builder;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dev
	{
	public static Set<String> listFilesUsingFilesList(String dir) throws IOException
		{
		try (Stream<Path> stream = Files.list(Paths.get(dir)))
			{
			return stream.filter(file -> !Files.isDirectory(file))
				.map(Path::getFileName)
				.map(Path::toString)
				.collect(Collectors.toSet());
			}
		}

	public static Set<String> listFilesUsingFileWalkAndVisitor(String dir) throws IOException
		{
		Set<String> fileList = new HashSet<>();

		Files.walkFileTree(Paths.get(dir), new SimpleFileVisitor<Path>()
			{
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
				{
				if (!Files.isDirectory(file))
					{
					fileList.add(file.getFileName().toString());
					}

				return FileVisitResult.CONTINUE;
				}
			});

		return fileList;
		}

	public static void main(String[] args) throws Throwable
		{
		/*
		listFilesUsingFilesList(".").forEach(path ->
			{
			System.out.println(path);
			});

		listFilesUsingFileWalkAndVisitor(".").forEach(path ->
			{
			System.out.println(path);
			});
		*/
		}
	}
