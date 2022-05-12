package com.pcwk.movie.test;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.pcwk.cmn.DTO;
import com.pcwk.movie.domain.Movie;
import com.pcwk.movie.dao.MovieDao;

public class MovieDaoTestMain {
	
	private static boolean available;
	MovieDao dao;
	Movie movie01;
	Movie movie02;
	Movie movie03;
	
	public MovieDaoTestMain() {
		
		dao = new MovieDao();
//		movie01 = new Movie("비긴어게인","영화",true);

	}
	
	public void saveFile() {
		int writeCnt = dao.saveFile("moviesTmp.csv");
		System.out.println("writeCnt : "+ writeCnt);
		
	}

	public void readFile() {
		for(Movie b : dao.MovieList) {
			System.out.println(b);
		}
		
	}
	/**
	 * 스캐너 통한 데이터 입력
	 * @param read
	 * @return
	 */
	public Movie getInputData(Scanner scanner) {
		Movie movie = null;
		
		String readInput = scanner.nextLine().trim();
		
		String[] dataArr = readInput.split(",");
		
		int point = Integer.parseInt(dataArr[2]);
		movie = new Movie(dataArr[0],dataArr[1], point);
		
		return movie;
	
	}
//-------------------------------------------------------------------	
	public static void main(String[] args) {
		
		MovieDaoTestMain movieMain = new MovieDaoTestMain();
		
		File books = new File(MovieDao.SAVE_FILE_PATH);
		
		if(! books.exists() || ! books.isFile()) {//파일이 존재하지 않고, 파일이 아니면
			try {
				books.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		
		String inCommand = "";//명령어 입력 
		//userId : java, passwd : 1234
		int point02 = 10000;
		
		System.out.print("로그인시 "+point02+"포인트 증정\n아이디를 입력하세요 ▶ ");
		String userId = scanner.nextLine();
		
		if(userId.equals("java")) {
			System.out.print("비밀번호를 입력하세요 ▶ ");
			String passwd = scanner.nextLine();
			
			if(passwd.equals("1234")) {
				System.out.println("로그인성공!\n10000 포인트 증정");
				System.out.print("목록을 확인해주세요 ▶ ");
			}else {
				System.out.print("비밀번호를 확인해주세요 ▶ ");
			}
			
		}else{
			System.out.print("아이디를 확인해주세요 ▶ ");
		}
		
		Movie outData = null;//대여데이터 임시저장
		
		do {
			inCommand = scanner.nextLine();
			inCommand = inCommand.trim();//앞 뒤 공백 제거
			
			Movie movie = null;
			
			String[] dataArr = null;
			
			String readInput = "";//Data입력변수
			
			switch(inCommand.toUpperCase()) {
			case "목록"://전체조회
				System.out.println("---------------------------------");
				System.out.println("제목\t장르\t차감포인트");
				System.out.println("---------------------------------");
				List<Movie> list = movieMain.dao.doRetrieve(movie);
				for(Movie b : list) {
					System.out.println(b.getTitle()+" | "+b.getGenre()+" | "+b.getPoint());
				}
				System.out.print("계속 진행하시겠습니까? (네 or 종료) ▶ ");
				break;
			
			case "네"://단건조회
				System.out.print("제목을 입력하세요 ▶ ");
				readInput = scanner.nextLine().trim();
				movie = new Movie();
				movie.setTitle(readInput);
				
				outData = movieMain.dao.doselectOne(movie);
				if(null == outData) {
					System.out.println("조회실패");
				}else {
					System.out.println(outData);
					System.out.print("\n대여 or 종료 ▶ ");
				}
				break;
			
			case "대여":
				int flag = movieMain.dao.saveFile(MovieDao.SAVE_FILE_PATH);
				int point = outData.getPoint();
				point02 -= point;
				if(point02 > 0) {
					System.out.println(point02+ "포인트 남았습니다");
					System.out.print("계속 하시겠습니까? (네)\n종료하시겠습니까? (종료)");
				}else {
					System.out.print("잔여 포인트가 부족합니다\n종료하시겠습니까? (종료)");
				}
			default:
				break;
			}//switch
			
		}while(! inCommand.equalsIgnoreCase("종료"));
		
		System.out.println("====================");
		System.out.println("즐거운 시청되세요");
		System.out.println("====================");
				
	}
}
