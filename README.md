# minidooray_accountapi

### POST /api/account/users
- Description: 새로운 사용자를 추가합니다.
- Path Variables: None
- Request Body: JSON 형식 요청

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |userId|string|Y||
  |password|string|Y||
  |userNickName|string|Y||
  |userEmail|string|Y||

- Response Code: 201 created
- Response Body: JSON 형식 응답

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |userUUID|string|Y||
  |userId|string|Y||
  |userNickName|string|Y||
  |userEmail|string|Y||
</br>

### GET /api/account/users/{userUUID}
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

### PUT /api/account/users/{userUUID}
- Description: 사용자 UUID로 조회하여 사용자 정보를 수정합니다.
- Path Variables: 
    - userUUID: 사용자 UUID
- Request Body: JSON 형식 요청

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |userId|string|Y||
  |password|string|Y||
  |userNickName|string|Y||
  |userEmail|string|Y||

- Response Code: 200 ok
- Response Body: JSON 형식 응답

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |userId|string|Y||
  |userNickName|string|Y||
  |userEmail|string|Y||
</br>

### DELETE /api/account/users/{userUUID}
- Description: 사용자 UUID로 대상 사용자 정보를 삭제합니다.
- Path Variables: 
    - userUUID: 사용자 UUID

- Response Code: 200 ok
- Response Body: Delete success.
</br>

### GET /api/account/users/data
- Description: 모든 사용자 정보 리스트를 반환합니다.
- Path Variables: None
- Response Code: 200 ok
- Response Body: JSON 형식 응답

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |userId|string|Y||
  |userNickName|string|Y||
  |userEmail|string|Y||
</br>

### GET /api/account/users/data/{userId}
- Description: userId로 조회한 사용자의 정보를 반환합니다.
- Path Variables: 
    - userId: 사용자 id
- Response Code: 200 ok
- Response Body: JSON 형식 응답

  |파라미터|타입|필수 여부|설명|
  |---|---|-|-----|
  |userId|string|Y||
  |userNickName|string|Y||
  |userEmail|string|Y||
</br>

### DELETE /api/account/users/data/{userId}
- Description: userId로 대상 사용자 정보를 삭제합니다.
- Path Variables: 
    - userId: 사용자 id
- Request Body: None
- Response Code: 200 ok
- Response Body: None
</br>

### POST /api/account/login
- Description: 로그인 요청을 보냅니다.
- Path Variables: None
- Request Body: JSON 형식 요청

    |파라미터|타입|필수 여부|설명|
    |---|---|-|-----|
    |userId|string|Y||

- Response Code: 200 ok
- Response Body: JSON 형식 응답

    |파라미터|타입|필수 여부|설명|
    |---|---|-|-----|
    |userUUID|string|Y||
    |userId|string|Y||
    |userNickname|string|Y|| 
    |userPassword|string|Y||
    |userEmail|string|Y||
</br>

### GET /api/account/login/{userId}
- Description: userId로 조회한 사용자의 정보를 반환합니다.
- Path Variables: 
    - userId: 사용자 id

- Response Code: 200 ok
- Response Body: JSON 형식 응답

    |파라미터|타입|필수 여부|설명|
    |---|---|-|-----|
    |userUUID|string|Y||
    |userId|string|Y||
    |userNickname|string|Y|| 
    |userPassword|string|Y||
    |userEmail|string|Y||
</br>

