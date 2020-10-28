# 1.使用 GCLogAnalysis.java 自己演练一遍串行 / 并行 /CMS/G1 的案例。
测试电脑 8核32G内存 deepain系统
执行命令

`java -XX:+UseSerialGC -Xms128m -Xmx128m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`

`java -XX:+UseParallelGC -Xms4096m -Xmx4096m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
       
`java -XX:+UseConcMarkSweepGC -Xms4096m -Xmx4096m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
       
`java -XX:+UseG1GC -Xms7196m -Xmx7196m -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -GCLogAnalysis`

## 1.1 串行 GC 分析
内存 | 现象 | ygc时间 | ogc时间 | 程序执行次数
:-: | :-: | :-: | :-: | :-: 
128 | OutOfMemoryError |...|...|...|
256 | OutOfMemoryError |...|...|...|
512 | 正常运行 | 0.02 | 0.04 | 12000左右|
1024 | 正常运行 | 0.01~0.05 | 无 | 16000~17000|
2048 | 正常运行 | 0.05~0.06 | 无 | 16000~17000|
4096 | 正常运行 | 0.07~0.09 | 无 | 15800~16600|
6144 | 正常运行 | 0.09~0.11 | 无 | 12500~13000|
8192 | 正常运行 | 0.1~0.11 | 无 | 10650~11600|
## 1.2 并行 GC 分析

## 1.3 CMS GC 分析

## 1.4 G1 GC 分析


# 2.使用压测工具（wrk 或 sb），演练 gateway-server-0.0.1-SNAPSHOT.jar 示例。

