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

### @RequestParam
- /board/list_controller?currentPage=1"형태의 요청을 처리

### @PathVariable
- "/board/list_controller/1"형태의 요청을 처리

### (HttpServletRequest req)
- String query_string = req.getQueryString(); 
