# validation-login-library
[![](https://jitpack.io/v/nivnaory/validation-login-library.svg)](https://jitpack.io/#nivnaory/validation-login-library)



Library for checking user creation based on email and password




## Setup
Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
	maven { url 'https://jitpack.io' }
    }
}
```

Step 2. Add the dependency:

```
dependencies {
	        implementation 'com.github.nivnaory:validation-login-library:v1.0'
}
```
## Usage
Step 1. create new instance of the class 


<img src="https://github.com/nivnaory/validation-login-library/blob/master/image1.png" width=600>

Step 2. call checkEmail function and checkPassword function:

<img src="https://github.com/nivnaory/validation-login-library/blob/master/image2.png" width="600">


## Functions

**` `**
**`Receives the email you want to check and displays a message accordingly
`**
```Java
checkEmail(String email);
```

**`Receives the password you want to check and displays a message accordingly `**
```Java
checkPassword(String password);


```
## display
1. No email and no password
<img src="https://github.com/nivnaory/validation-login-library/blob/master/email._empty.png" width=200>

2. email not valid
<img src="https://github.com/nivnaory/validation-login-library/blob/master/email_not_valid.png" width=200>

3. email valid and password is empty
<img src="https://github.com/nivnaory/validation-login-library/blob/master/email_valid_password_empty.png" width=200>


4. email valid and password="abc" is  short
<img src="https://github.com/nivnaory/validation-login-library/blob/master/email_valid_passowr_short.png" width=250>

5. email valid and password="abcabc" is not contain uppercase 
<img src="https://github.com/nivnaory/validation-login-library/blob/master/email_valid_passowrd_only_lower.png" width=250>

6. email valid and password="abcabcA" is not contain digit 
<img src="https://github.com/nivnaory/validation-login-library/blob/master/email_valid_passowrd_not_contain_digit.png" width=250>

7. email valid and password="abcabcA6" is valid we get Confirmation  massage 
<img src="https://github.com/nivnaory/validation-login-library/blob/master/email_valid_passowrd_valid.png" width=200>


## License
Copyright 2020 niv naory 

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.







