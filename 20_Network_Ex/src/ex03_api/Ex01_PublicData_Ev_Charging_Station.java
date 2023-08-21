package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class Ex01_PublicData_Ev_Charging_Station {

  public static void main(String[] args) {

    // 문제. 공공데이터포털(data.go.kr)에서 "한국전력공사_전기차 충전소 운영정보" API를 신청하고
    // 결과를 "C:/storage/한국전력공사_전기차_충전소_운영정보.xml"로 저장하시오
    
    /*
     * 한국전력공사_전기차 충전소 운영정보 - 전기차충전소정보 검색결과 조회
     * 1. 요청주소 : http://openapi.kepco.co.kr/service/EvInfoServiceV2/getEvSearchList
     * 2. 요청변수(Request Parameter)
     *    1) serviceKey : 필수, 인코딩된 인증키
     *    2) pageNo     : 필수, 1
     *    3) numOfRows  : 필수, 10
     *    4) addr       : 옵션, 전라남도 나주시 빛가람동 120
     */
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    BufferedWriter writer = null;

    try {
      
      String spec = "http://openapi.kepco.co.kr/service/EvInfoServiceV2/getEvSearchList";
      String serviceKey = "mOr9klFON18lSGvb1kU4qHn1hLIqscShuDWmrseW3DttNAGbqMSV5bFKTuEtJyj5zBrWVr+uVOsITrAFIrQhQA==";
      String pageNo = "1";
      String numOfRows = "10";
      String addr = "전라남도 나주시 빛가람동 120";
      
      StringBuilder sb = new StringBuilder();
      sb.append(spec);
      sb.append("?serviceKey=").append(URLEncoder.encode(serviceKey, "UTF-8"));
      sb.append("&pageNo=").append(URLEncoder.encode(pageNo,"UTF-8"));
      sb.append("&numOfRows=").append(URLEncoder.encode(numOfRows,"UTF-8"));
      sb.append("&addr=").append(URLEncoder.encode(addr, "UTF-8"));
      
      url = new URL(sb.toString());
      con = (HttpURLConnection)url.openConnection();
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sbuf = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sbuf.append(line + "\n");
      }
      
      File dir = new File("C:/storage");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file = new File(dir, "한국전력공사_전기차_충전소_운영정보.xml");
      writer = new BufferedWriter(new FileWriter(file));
      writer.write(sbuf.toString());
      
      System.out.println(file.getPath() + " 파일 생성 완료");
      
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (RuntimeException e) {
      e.printStackTrace();
    } finally {
      try {
        if(writer != null) writer.close();
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  
  }
  

}
