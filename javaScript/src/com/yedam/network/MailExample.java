package com.yedam.network;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailExample {
   public static void main(String[] args) throws AddressException, MessagingException {
      String host = "smtp.naver.com"; // Mail서버
      final String user = "xxgy9796@naver.com"; // ID
      final String passwd = "dkdlfjsl12!@"; // 비밀번호

      String toUser = "herooic@naver.com"; // 수신 메일주소

      Properties props = new Properties();
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", 587);
      props.put("mail.smtp.auth", true);

      Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(user, passwd);
         }
      });
      MimeMessage message = new MimeMessage(session);
      message.setFrom(new InternetAddress(user));
      message.addRecipient(Message.RecipientType.TO, new InternetAddress(toUser));

      message.setSubject("네이버 메일 테스트"); // 메일 제목
      message.setText("격하게 하기싫다 젠장."); // 메일 본문
      Transport.send(message); // 메일 발송
      System.out.println("메일 전송됨");
   }
}