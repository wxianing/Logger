# Logger
## 使用步骤
### 第一步：项目根gradle文件添加
```
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```
### 第二步：应用gradle文件添加
```
  	dependencies {
	        implementation 'com.github.wxianing:Logger:1.0.2'
	}
```

## Logger API:

使用之前需要初始化

```

    //控制是否可以打印
    Logger.init(boolean boo)

    //boo:控制是否可以打印、DEFAULT_TAG：默认打印TAG
    Logger.init(boolean boo, String DEFAULT_TAG)

```


```

    Logger.v(String tag, String message)

    Logger.d(String tag, Object message)

    Logger.d(Object message)

    Logger.i(String tag, String message)

    Logger.e(String tag, String message)

    //日志写入文件
    Logger.w(String tag, String message)

    //json格式打印
    Logger.json(String tag, String message)

```
