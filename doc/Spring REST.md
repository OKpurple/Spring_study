# Spring REST

### @RequestBody
- post시 header = `application/json`
- ```{
"title" : "postTitle",
"writer" : "a",
"content" : "postContent"
}``` 형태

### ResponseEntity
- new ResponseEntity<_type_>(_type_,HttpStatus.OK)