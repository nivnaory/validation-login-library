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
Step 1. create new instance: 

<img src="https://github.com/nivnaory/validation-login-library/blob/master/image1.png" width="500">

Step 2. call checkEmail and checkPassword function:

<img src="https://github.com/nivnaory/validation-login-library/blob/master/image2.png" width="600">


## Video
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/https:https://youtu.be/5qF_qbaWt3Q/0.jpg)](https://www.youtube.com/watch?v=https:https://youtu.be/5qF_qbaWt3Q)


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
## Credits







