# 1.使用 GCLogAnalysis.java 自己演练一遍串行 / 并行 /CMS/G1 的案例。
执行命令

`java -XX:+UseSerialGC -Xms128m -Xmx128m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`

`java -XX:+UseParallelGC -Xms4096m -Xmx4096m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
       
`java -XX:+UseConcMarkSweepGC -Xms4096m -Xmx4096m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis`
       
`java -XX:+UseG1GC -Xms7196m -Xmx7196m -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -GCLogAnalysis`

## 1.1 串行 GC 分析
内存 | 现象 | ygc平均时间 | ogc平均时间 | 最大时间
:-: | :-: | :-: | :-: | :-:
128 | bbb | ccc | ddd | eee| 
256 | ggg| hhh | iii | 000|
512 | ggg| hhh | iii | 000|
1024 | bbb | ccc | ddd | eee| 
2048 | ggg| hhh | iii | 000|
4096 | ggg| hhh | iii | 000|
6144 | ggg| hhh | iii | 000|
8192 | ggg| hhh | iii | 000|
## 1.2 并行 GC 分析
## 1.3 CMS GC 分析
## 1.4 G1 GC 分析

# 2.使用压测工具（wrk 或 sb），演练 gateway-server-0.0.1-SNAPSHOT.jar 示例。

