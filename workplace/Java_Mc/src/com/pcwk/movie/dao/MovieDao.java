package com.pcwk.movie.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pcwk.cmn.DTO;
import com.pcwk.cmn.LoggerManager;
import com.pcwk.cmn.WorkDiv;
import com.pcwk.movie.domain.Movie;

public class MovieDao implements WorkDiv<Movie>, LoggerManager {

	public static List<Movie> MovieList = new ArrayList<>();
	// 저장 파일 경로
	public final static String SAVE_FILE_PATH = "D:\\java\\work\\work\\workplace\\Java_Mc\\src\\com\\pcwk\\mc\\movie.csv";

	public MovieDao() {
		int readStatus = readFile(SAVE_FILE_PATH);
		if (0 == readStatus) {
			LOG.debug("파일 읽기 실패");

		} else {
			LOG.debug("파일 읽기 성공");
		}
	}

	/**
	 * ArrayList에 있는 내용을 SAVE_FILE_PATH에 기록
	 * 
	 * @param filePath
	 * @return 저장 건수 return
	 */
	public int saveFile(String filePath) {
		int writeCnt = 0;
		// FileWriter fw = new FileWriter(filePath);

		// try-with-resource
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

			// arrayList -> file 기록
			for (Movie movie : MovieList) {
				// 1163032212-9791163032212,Do it !HTML, CSS, <b>자바</b>스크립트 한 권의 정석,고경희,IT,1
				String del = ",";

				// 대여가능 여부
				//int available = movie.isAvailable() ? 1 : 0;

				String outData = movie.getTitle() + del + movie.getGenre() + del +movie.getPoint() + "\n";
				bw.write(outData);

				writeCnt++;

			}

		} catch (IOException e) {
			LOG.debug("==============");
			LOG.debug("=IOException=" + e.getMessage());
			LOG.debug("==============");
		}

		return writeCnt;

	}

	/**
	 * movie.csv를 읽어서 MovieList 할당
	 * 
	 * @param filePath
	 * @return 0(실패)/1(성공)
	 */
	public int readFile(String filePath) {
		int flag = 0;
		// try-with-resource
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = "";

			int i = 0;
			while ((line = br.readLine()) != null) {

				String[] inArray = line.split(",");
				

				// public Movie(String title, String genre, boolean
				// available)
				// 대여가능 여부
				// 1 -> true
				// 0 -> false
				//boolean available = (inArray[2].equals("1") ? true : false);
                int point = Integer.parseInt(inArray[2]);
				Movie movie = new Movie(inArray[0], inArray[1],point);
				MovieList.add(movie);
			}

			if (MovieList.size() > 0)
				flag++;

		} catch (IOException e) {
			LOG.debug("======================");
			LOG.debug("IOException" + e.getMessage());
			LOG.debug("======================");
		}

		return flag;
	}

	@Override
	public List<Movie> doRetrieve(DTO dto) {

		return MovieList;
	}

	/**
	 * Book이 존재하는지 확인
	 * 
	 * @param dto
	 * @return 1(존재)/0(없음)
	 */
	public int isMovieExists(Movie dto) {
		int flag = 0;

		for (Movie movie : MovieList) {
			if (movie.getTitle().equals(dto.getTitle())) {
				flag = 1;
				break;
			}
		}
		return flag;

	}

	@Override
	public int doSave(Movie dto) {
		if (1 == isMovieExists(dto)) {
			System.out.println("도서 번호가 존재합니다\n중복도서 번호" + dto.getTitle());
			return -1;
		}
		boolean flag = MovieList.add(dto);

		return (flag == true) ? 1 : 0;
	}

	@Override
	public int doDelete(Movie dto) {
		int flag = 0;
		// 삭제하기 :
		for (int i = this.MovieList.size() - 1; i >= 0; i--) {
			Movie movie = MovieList.get(i);
			// 도서번호로 비교
			if (movie.getTitle().equals(dto.getTitle())) {
				MovieList.remove(i);
				flag = 1;
				break;
			}
		}
		return flag;
	}

	public Movie doSelectOne(Movie dto) {
		Movie outData = null;

		for (Movie movie : MovieList) {
			if (movie.getTitle().equals(dto.getTitle())) {
				outData = movie;
				break;
			}
		}
		return outData;
	}

	@Override
	public int doUpdate(Movie dto) {
		int flag = 0;

		// 1.수정 데이터가 있는지 확인
		// 2.기존 데이터 삭제
		// 3.수정 데이터 등록

		flag += doDelete(dto);
		flag += doSave(dto);

		return flag;
	}

	public List<Movie> doRetrieve(Movie movie) {
		return MovieList;
	}

	@Override
	public Movie doselectOne(Movie dto) {
		Movie outData = null;

		for (Movie movie : MovieList) {
			if (movie.getTitle().equals(dto.getTitle())) {
				outData = movie;
				break;
			}
		}
		return outData;
	}

}
