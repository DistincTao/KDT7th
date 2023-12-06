package io;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		File dir = new File("D:\\Lectures\\java");
		File file1 = new File ("D:\\Lectures\\java\\IO_Ex4\\test1.txt");
		File dir2 = new File("D:\\Lectures\\java\\IO_Ex4\\test");
		
		System.out.println(dir.exists());
		
		if (!file1.exists()) {
			file1.createNewFile();
		}

		if (!dir2.exists()) {
			dir2.mkdir();
		}
		
		File[] fileList = dir.listFiles();


		int fileCnt = 0;
		long sum = 0;
		int dirCnt = 0;
		DecimalFormat numberFormat = new DecimalFormat ("#,###");
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		String usableSpace = numberFormat.format(dir.getUsableSpace());
		String now = dateformat.format(new Date (dir.lastModified()));

		System.out.printf("%s %8s %8s %-16s %n" ,now ,"<DIR>","",".");
		System.out.printf("%s %8s %8s %-16s %n" ,now ,"<DIR>","","..");
		
		for (File f : fileList) {
			Date modifiedTime = new Date (f.lastModified());
			String modified = dateformat.format(modifiedTime);
			String fileSize = numberFormat.format(f.length());
			
			if (f.isDirectory()) {
				System.out.printf("%s %8s %8s %-16s %n" ,modified,"<DIR>","",f.getName());
				dirCnt++;
			} else  {
				System.out.printf("%s %17s %-16s %n" ,modified, fileSize, f.getName());
				sum += f.length();
				fileCnt++;
			} 

		}
		String sumFileSize = numberFormat.format(sum);

		System.out.printf("%16s %-3s %19s %-8s  %n", fileCnt + "개" ,"파일", sumFileSize, "바이트");
		System.out.printf("%16s %-4s %18s %-8s  %n", dirCnt + 2 + "개", "디렉터리", usableSpace, "바이트 남음");

	}

}
