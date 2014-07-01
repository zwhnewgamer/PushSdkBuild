PushSdkBuild
============

PushSDK_Release
----------
用于生成配置文件的工程
		
		pushsdk_thirdpary_string.xml文件
		
pushsdk.conf 	文件为默认配置，可以在此基础上修改。当文件不存时，可以通过ant 配置，生成新的配置文件。

config.xml 		配置文件生成脚本。


build
------
pushsdk_setup.xml  sdk集成脚本。

		脚本文件需放在工程根目录下。该脚本会自动集成sdk 且自动配置manifest文件。需要把 PushSDK_Release 工程导入eclipse中。
		
