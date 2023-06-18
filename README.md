# minidooray_accountapi

## user

### POST /api/users
- Description: 새로운 사용자를 추가합니다.
- Path Variables: None
- Request Body: JSON 형식 요청

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |userUUID|string|Y||
  |userId|string|Y||
  |userNickName|string|Y||
  |userEmail|string|Y||

- Response Code: 200 ok
- Response Body: None
</br>

### GET /api/users/{userUUID}
- Description: 사용자 UUID로 조회한 사용자 정보를 반환합니다.
- Path Variables: 
    - userUUID: 사용자 UUID

- Response Code: 200 ok
- Response Body: JSON 형식 응답

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |userUUID|string|Y||
  |userId|string|Y||
  |userNickName|string|Y||
  |userEmail|string|Y||
</br>

### GET /api/users
- Description: 모든 사용자 정보리스트를 반환합니다.
- Path Variables: None
- Response Code: 200 ok
- Response Body: JSON 형식 응답

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |userUUID|string|Y||
  |userId|string|Y||
  |userNickName|string|Y||
  |userEmail|string|Y||
</br>

### PUT /api/users/{userUUID}
- Description: 사용자 UUID로 조회하여 사용자 정보를 수정합니다.
- Path Variables: 
    - userUUID: 사용자 UUID
- Request Body: JSON 형식 요청

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |userUUID|string|Y||
  |userId|string|Y||
  |userNickName|string|Y||
  |userEmail|string|Y||

- Response Code: 200 ok
- Response Body: None
</br>

### DELETE /api/users/{userUUID}
- Description: 사용자 UUID로 대상 사용자 정보를 삭제합니다.
- Path Variables: 
    - userUUID: 사용자 UUID

- Response Code: 200 ok
- Response Body: None
</br>

### GET /api/users/{userUUID}/tasks
- Description: 사용자 UUID로 조회한 사용자의 모든 태스크 리스트를 반환합니다.
- Path Variables: 
    - userUUID: 사용자 UUID
- Response Code: 200 ok
- Response Body: JSON 형식 응답

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |userUUID|string|Y||
  |taskId|long|Y||
</br>

### GET /api/users/{userUUID}/projects
- Description: 사용자 UUID로 조회한 사용자의 모든 프로젝트 리스트를 반환합니다.
- Path Variables: 
    - userUUID: 사용자 UUID
- Response Code: 200 ok
- Response Body: JSON 형식 응답

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |projectId|string|Y||
  |projectName|string|Y||
  |projectDescription|string|Y||
  |projectStatus|ACTIVE, INACTIVE, CLOSED|Y||
  |userUUID|string|Y||
</br>


## project

### POST /api/projects
- Description: 새로운 프로젝트를 추가합니다.
- Path Variables: None
- Request Body: JSON 형식 요청
  
    |파라미터|타입|필수 여부|설명|
    |---|---|-|-----|
    |projectName|string|Y||
    |projectDescription|string|Y|| 
    |projectStatus|string|Y||
    |userUUID|string|Y||

- Response Code: 200 ok
- Response Body: None
</br>

### GET /api/projects/{projectId}
- Description: 프로젝트 ID로 조회한 프로젝트 정보를 반환합니다.
- Path Variables: 
    - projectId: 프로젝트 ID

- Response Code: 200 ok
- Response Body: JSON 형식 응답

    |파라미터|타입|필수 여부|설명|
    |---|---|-|-----|
    |projectId|string|Y||
    |projectName|string|Y||
    |projectDescription|string|Y|| 
    |projectStatus|ACTIVE, INACTIVE, CLOSED|Y||
    |userUUID|string|Y||
</br>

### PUT /api/projects/{projectId}
- Description: 프로젝트 ID로 조회하여 프로젝트 정보를 수정합니다.
- Path Variables: 
    - projectId: 프로젝트 ID
- Request Body: JSON 형식 요청
  
    |파라미터|타입|필수 여부|설명|
    |---|---|-|-----|
    |projectName|string|Y||
    |projectDescription|string|Y|| 
    |projectStatus|string|Y||
    |userUUID|string|Y||

- Response Code: 200 ok
- Response Body: None
</br>

### DELETE /api/projects/{projectId}
- Description: 프로젝트 ID로 대상 프로젝트 정보를 삭제합니다.
- Path Variables: 
    - projectId: 프로젝트 ID
- Response Code: 200 ok
- Response Body: None
</br>

### POST /api/projects/{projectId}/users/{userUUID}
- Description: 프로젝트 ID와 사용자 UUID로 조회하여 프로젝트에 사용자를 추가합니다.
- Path Variables: 
    - projectId: 프로젝트 ID
    - userUUID: 사용자 UUID
- Response Code: 200 ok
- Response Body: None
</br>

### GET /api/projects/{projectId}/users
- Description: 프로젝트 ID로 조회한 프로젝트의 모든 사용자 리스트를 반환합니다.
- Path Variables: 
    - projectId: 프로젝트 ID
- Response Code: 200 ok
- Response Body: JSON 형식 응답

    |파라미터|타입|필수 여부|설명|
    |---|---|-|-----|
    |userUUID|string|Y||
    |userId|string|Y||
    |userNickName|string|Y||
    |userEmail|string|Y||
</br>

### DELETE /api/projects/{projectId}/users/{userUUID}
- Description: 프로젝트 ID와 사용자 UUID로 조회하여 프로젝트에서 사용자를 삭제합니다.
- Path Variables: 
    - projectId: 프로젝트 ID
    - userUUID: 사용자 UUID
- Response Code: 200 ok
- Response Body: None
</br>

### DELETE /api/projects/{projectId}/users
- Description: 프로젝트 ID로 조회한 프로젝트의 모든 사용자를 삭제합니다.
- Path Variables: 
    - projectId: 프로젝트 ID
- Response Code: 200 ok
- Response Body: None
</br>
