![jenkins](https://user-images.githubusercontent.com/79403065/142773218-2f658f1e-b1c1-4bc9-82c5-6d5ddd094405.png)   ![allure](https://user-images.githubusercontent.com/79403065/142773239-42307d2a-49c2-40b6-a849-d1688d70ce35.png)    ![allure testops](https://user-images.githubusercontent.com/79403065/142773197-229cc04a-5e72-4908-a7ef-910a923951eb.jpg)


## USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```

## Reports examples

### Allure report
![chrome_xBHBCtQnP6](https://user-images.githubusercontent.com/79403065/142772690-78588b21-f9d0-4d6d-8904-2ef9f0871c83.png)

![chrome_L3t63IhB38](https://user-images.githubusercontent.com/79403065/142772672-dccd54ee-2b89-4d23-a456-39079dc0660e.png)

![414209dd746383ef3d1857ef622f30d4_Trim](https://user-images.githubusercontent.com/79403065/142772934-e308f842-c60d-4980-892d-ec62aad0c2f7.gif)

### Allure TestOps 

![chrome_fctpiGtb2z](https://user-images.githubusercontent.com/79403065/142772774-15db2da4-93ab-4d78-b82d-6cab39e79ef8.png)

