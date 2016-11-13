# Twitter Stream
This is the code from Chapter 2 of "_Reactive Web Applications_" book by Manuel Bernhardt.

## How to use it?
1. Update the `conf/application.conf` with your Twitter Api Credentials as follow:
```
twitter.apiKey="192837912873918273"
twitter.apiSecret="1298379128739182"
twitter.token="4755850291827390127309812"
twitter.tokenSecret="918278273"
```
2. Run with `activator` and then `run`
3. You can add more nodes with `activator -DmasterNodeUrl=http://localhost:9000/replicatedFeed` and then `run 9001`





