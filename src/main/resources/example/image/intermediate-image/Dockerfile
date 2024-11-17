# 기본 이미지를 httpd로 설정
FROM httpd:2.4

# 웹 콘텐츠를 복사할 디렉토리 생성
RUN mkdir -p /usr/local/apache2/htdocs/

# 간단한 HTML 파일을 생성
COPY intermediate-image/index.html /usr/local/apache2/htdocs/

# 아파치 서버의 기본 포트를 노출
EXPOSE 80

