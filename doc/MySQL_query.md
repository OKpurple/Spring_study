### 사용자 추가
```
create user '유저아이디'@'%'(|| 'localhost') identified by '유저패스워드';
```
### 권한 부여
```
grant all(|| select,inset,..) privileges on 디비명(|| *).* to '유저아이디'@'%';
```

### DB명 변경
`Create database new_db_name;`
`RENAME TABLE db_name.table1 TO new_db_name, db_name.table2 TO new_db_name;`
`DROP database db_name;`

### Root비밀번호 초기화

`$ service mysql stop`

_etc/mysql/마이에스큐엘.config를 수정_

_brew 설치시 /usr/local/Cellar/mysql/5.7.17/support-files내의 conf_

```
[mysqld]
#
# * Basic Settings
#
user         = mysql
pid-file     = /var/run/mysqld/mysqld.pid
socket       = /var/run/mysqld/mysqld.sock
port         = 3306
basedir      = /usr
datadir      = /var/lib/mysql
tmpdir       = /tmp
lc-messages-dir = /usr/share/mysql
 
skip-external-locking
 
skip-grant-tables  << 추가
```
mysql 재시작

`$sudo service mysql start`

root비밀번호 재설정

`$mysql -uroot mysql`
`UPDATE user SET password=PASSWORD('ROOT_비밀번호') WHERE user='root';`

conf복원하고 mysql service 재실행
