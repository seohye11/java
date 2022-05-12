package anstjgp_0204;

public class Ex_0302 {

	public static void main(String[] args) {
		
		/* 자바 입출력
		 * > 스트림 : 자료의 흐름이 물과 같다는 의미에서 유래
		 *          다양한 입출력 장치에 독립적으로 일관성 있는 입출력을 제공
		 *          입출력이 구현되는 곳 : 파일, 키보드, 마우스, 네트웍 등
		 *  - 스트림 분류 : 대상기준   -> 입력/출력 스트림
		 *               자료의종류 -> 바이트/문자 스트림
		 *               기능     -> 기반 / 보조 스트림
		 * 입력 스트림 : 대상으로부터 자료를 읽어들이는 스트림
		 *          - FileInputStream, FileReader, BufferedlnputStream,
		 *            BufferedReader 등
		 * 출력 스트림 : 대상으로 자료를 출력하는 스트림
		 *          - FileOutputStream, FileWriter, BufferedOutputStream,
		 *            BufferedWriter 등
		 * 바이트 단위 스트림(1byte) : 동영상, 음악, 그림 등 -> XXXInputStream/XXXOutStream
		 *          - FileInputStream, FileOutputStream, BufferedlnputStream,
		 *            BufferedOutputStream 등
		 * 문자 단위 스트림(2byte) -> XXXReader/XXXWriter
		 *          - FileReader, FileWriter, BufferedReader, BufferedWriter 등
		 * 기반 스트림 : 대상에 직접 읽고 쓰는 기능의 스트림
		 *          - FileInputStream, FileOutputStream, FileReader, FileWriter 등
		 * 보조 스트림 : 직접 읽고 쓰는 기능은 없음, 추가적인 기능을 더해주는 스트림
		 *            직접 읽고 쓰는 기능이 없으므로 항상 기반 스트림이나 또 다른 보조 스트림을
		 *            생성자 매개변수로 받음
		 *          - InputStreamReader, OutputStreamWriter, BufferedInputStream,
		 *            BufferedOutputStream 등
		 * 바이트 스트림-InputStream
		 *          : 바이트 단위로 데이터 처리, 추상클래스로 하위 클래스가 구현하여 사용
		 *  int read() : 입력 스트림으로부터 한 바이트의 자료를 읽는다 읽은 자료의 바이트 수 반환
		 *  int read(byte[] b) 
		 *             : 입력스트립으로부터 b[] 바이트의 자료를 읽는다
		 *               읽은 자료의 바이트 수를 반환
		 *  read(byte[] b, int off, int len)
		 *             : 입력 스트림으로부터 []크기의 자료를 b[]의 off변수 위치부터 저장하여
		 *               len만큼 읽는다 읽은 자료의 바이트 수를 반환
		 * 
		 * FileOutputStream
		 *   : 파일에 관련된 내용을 기록할 수 있음 
		 * DataInputStream과 DataOutputStream
		 *   : FilterInputStream / FilterOutputStream의 자손
		 *     자료를 읽고 쓸 때 byte단위가 아니고, 8가지 기본 자료형으로 읽고 쓸 수 있다
		 *     
		 *     Data를 16진수로 표현하여 저장한다
		 *
		 * OutputStream
		 *   : 바이트 단위 출력용 최상위 클래스
		 *     추상 클래스로 하위 클래스가 구현하여 사용    
		 * 
		 * 문자 단위 스트림(Reader)
		 *   : 문자 단위(2byte)로 읽는 최상위 스트림
		 * 문자 단위 스트림(Writer)
		 *   : 문자 단위 출력 스트림
		 *     
		 * File
		 *   : File클래스를 통해서 파일과 디렉토리를 다룰 수 있다    
		 *     
		 *     
		 * 직열화(Serialization)
		 *   : 객체를 데이터 스트림으로 만드는 것
		 *     객체를 컴퓨터에 저장했다가 다음에 다시 꺼내 쓸 수 있게 처리  
		 *     객체를 저장한다는 것은 객체의 모든 인스턴스 변수를 저장하는 것
		 * 
		 * 역직열화(deserialization)
		 *   : 스트림으로부터 데이터를 읽어 객체를 만드는 것
		 * 
		 * 직열화 클래스
		 *   > ObjectOutputStream : 직열화 writeObject
		 *     ObjectInputStream : 역직열화 readObject
		 * 
		 * 직열화 가능한 클래스 만들기
		 * java.io.Serializable인터페이스를 구현
		 * 
		 * 도서관리 프로그램
		 * > 데이터는 파일에 저장한다
		 * > 처음 1회 파일에서 ArrayList<BooK>
		 * > CRUD
		 */  
	}

}





























