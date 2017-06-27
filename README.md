# Spring_study

## 06/26 의문사항

- VO를 json으로 응답하는 RESTapi 테스트시 VO에 생성자가 있을 경우 5xx에러가 뜨는 이유



## 06/27 Spring REST
#### @RequestBody
- post시 header = `application/json`
- ```{
"title" : "postTitle",
"writer" : "a",
"content" : "postContent"
}``` 형태

#### ResponseEntity
- new ResponseEntity<_type_>(_type_,HttpStatus.OK)