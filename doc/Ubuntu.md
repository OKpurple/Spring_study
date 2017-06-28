#Ubuntu


### SpringProject배포

- Filezilla 사용 > war 파일 서버디렉토리 전송


- 톰캣, 아파치, 등 필요 프로그램 설치 (apt-get)
- port설정 (기본 8080)

```
$cd /var/lib/tomcat7/conf
$vim server.xml
//8080포트를 원하는 포트번호로 수정
$service tomcat7 restart
```
- 배포

```
/var/lib/tomcat7/webapps
//war 배포
```

- war파일명을 포트뒤에 적어줘야함 (root로 설정가능)
	- __아이피주소:8080/war프로젝트명/api__