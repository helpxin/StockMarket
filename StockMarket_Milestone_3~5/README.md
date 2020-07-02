1.My database is on the public cloud, 
so don't need to start the local database. 
(The SQL files of the relevant dB are in the DB folder.)

2.Next, start the eshop-server, eshop-member, eshop-auth and eshop-gateway respectively

3.Get authentication address
http://localhost:1202/auth/oauth/token?grant_type=password&username=哈哈&password=1

4.has the accesstoken to request the system
for example : http://localhost:1202/auth/api/member?access_token=7a15cf50-f0f3-4e9b-a69c-2a10deb16298