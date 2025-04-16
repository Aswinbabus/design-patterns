package CommandPattern.Commands;

import CommandPattern.CommandSchedulerService;
import CommandPattern.LoggableCommand;
import CommandPattern.QueuableCommand;
import CommandPattern.RetryCommand;
import CommandPattern.Services.FileStorageService;
import CommandPattern.UndoableCommand;

public class UploadFileCommand implements LoggableCommand,UndoableCommand, RetryCommand
{


	private final FileStorageService fileStorageService;
	private final String fileContent;
	private int fileUID;

	public UploadFileCommand(FileStorageService fileStorageService, CommandSchedulerService executorService, String fileContent)
	{
		this.fileStorageService = fileStorageService;
		this.fileContent = fileContent;
	}

	@Override
	public void execute()
	{
		this.fileUID = fileStorageService.storeFile(fileContent);
	}


	@Override
	public void undo()
	{
		if (fileStorageService.removeFile(fileUID))
		{
			System.out.println("File has been removed with id : " + this.fileUID);
		}
		else
		{
			System.out.println("File removal failed with id : " + this.fileUID);
		}
	}

	@Override
	public void retry()
	{
		this.fileStorageService.storeFile(fileContent);
		System.out.println("File has been uploaded with id : " + this.fileUID);
	}

	@Override
	public String toString()
	{
		return "UploadFileCommand{" + "fileContent='" + fileContent + '\'' + ", fileUID=" + fileUID + '}';
	}
}
