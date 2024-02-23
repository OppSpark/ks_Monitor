# ks_Monitor
- 경성대학교 강의실 상태 상태 확인 프로젝트



## 프로젝트 소개
---
- 경성대학교 공과대학 8호관 강의실 현황 및 상태를 알 수 있는 웹사이트 입니다.
1. 관리자는 강의실 현황을 관리할 수 있고, 사용자는 강의실 현황을 확인할 수 있습니다.
2. 강의실 현황은 강의실의 이름, 강의실의 상태, 강의실의 위치, 강의실의 이벤트(강의)를 확인할 수 있습니다.

## 프로젝트 목표
- 기능 구현을 목표로 합니다.
- 기존의 명령형 프로그래밍 방식의 코드를 작성하되 일부분을 함수형 프로그래밍 방식으로 작성한다.

## 개발 기간
---
- 2024년 02월 20일 ~ ...

## 개발환경
---
- OS: Ubuntu 22.04, MacOS
- LANGUAGE: JAVA 17
- IDE : IntelliJ IDEA, VSCode
- FRAMEWORK: Spring Boot 3.2.2


## 기술 스택
---
- DATABASE: 미정(MySQL, H2,)
- SERVER: 미정
- FRONTEND: 미정
- BACKEND: Spring Boot3.2.2



## 엔드포인트

### VIEW
---
- /
    - GET
- /error
    - GET
- /login
    - GET
- /sign-up
    - GET
- /admin/places
    - GET
- /admin/placed{placed-id}
    - GET
- /places
    - GET
- /places/{place-id}
    - GET
- /admin/events
    - GET
- /admin/events/{event-id}
    - GET
- /events
    - GET
- /events/{event-id}
    - GET

  
### API
---
- /api/sign-up
    - POST
- /api/login
    - GET
- /api/places
    - GET
- /api/places/{event-id}
    - GET
- /api/places
    - POST
- /api/places/{event-id}
    - PUT
- /api/places/{place-id}
    - DELETE
- /api/events
    - GET
- /api/events/{event-id}
    - GET
- /api/events
    - POST
- /api/events/{event-id}
    - PUT
- /api/events/{event-id}
    - DELETE
