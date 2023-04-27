Microservice 

-Rest , Small well choose deploy units , cloud enable

การพิจารณาความท้าทายที่สำคัญของ microservice
-	เริ่มด้วยบริบทของโปรแกรมเหมาะสมกับ microservice ไหม
-	ปัญหาของการจัดการโปรแกรมที่เป็น microservice หลายร้อยตัวเราจะจัดการได้อย่างไร
-	เราสามารถเพิ่มลดขนาดของโปรแกรมที่ใช้อยู่
-	เราจะป้องกันไม่ให้ microservice หยุดทำงานได้ยังไง
Spring cloud 
 ![image](https://user-images.githubusercontent.com/97660202/234745711-2cf3b612-54a6-40b9-9bf7-a722a9083bba.png)
 
![image](https://user-images.githubusercontent.com/97660202/234745724-fa2ec205-9f84-4013-8703-7447994355b5.png)

 
Ref in28minutes/spring-microservices-v3 (github.com)
 ![image](https://user-images.githubusercontent.com/97660202/234745751-d1f184d5-8843-4d55-8072-9f0a15641c98.png)


เริ่มจะทำการเช็คว่า application config ของเราใช้งานได้หรือไม่โดยเขียน class model , controller and configuration ขึ้นมา
	โดย class controller name is LimitController โดยเรียน value from Configuration class
 ![image](https://user-images.githubusercontent.com/97660202/234745789-c05939e8-7011-4bbe-97a0-39f8ffff3ddb.png)
 
![image](https://user-images.githubusercontent.com/97660202/234745798-25ac7aa1-8dbb-42ef-99cb-68bbd654a7fb.png)

โดย Configuration class นั้นรับค่ามาจากที่เราเขียน config ใน application.properties
 ![image](https://user-images.githubusercontent.com/97660202/234745823-63340ae4-d36b-41be-8f04-9fed69388cb6.png)
 ![image](https://user-images.githubusercontent.com/97660202/234745833-0eedef08-df63-434b-9d36-7ac0724bb1c0.png)
![image](https://user-images.githubusercontent.com/97660202/234745845-6c647a5a-ee88-4095-96da-e9fec7377d2a.png)


การเชื่อม spring cloud config server to git repo
  โดยผ่าน git uri 
  ![image](https://user-images.githubusercontent.com/97660202/234745856-3a01d1e5-73fd-4cf5-9da7-55049d948acf.png)

 
โดยเราสร้าง config ขึ้นมาชื่อว่า limits-service.properties
  ![image](https://user-images.githubusercontent.com/97660202/234745870-79ac42ea-8544-4c1c-b62e-9d13f2d4f71d.png)

และทำการ push code to github 
เวลา spring server เรียกใช้จะไปเอา code last version from git มาโดยต้องมี annotation EnableConfigServer.

![image](https://user-images.githubusercontent.com/97660202/234745881-567d9202-5a5f-47be-83b8-6cfb9d3bc35d.png)

ต่อไปจะเป็นการเก็บค่าแบบ microservice ที่สามารถเรียกใช้ได้หลาย ๆ service และจัดการในที่เดียว
โดยเราจะออกแบบกำหนด 3 properties
 ![image](https://user-images.githubusercontent.com/97660202/234745901-99cae4e3-6d58-4da4-a503-34a22ccef7f8.png)

และทำการเรียกใช้ใน service limitService

เลือก Limit-service.properties  (default)
 ![image](https://user-images.githubusercontent.com/97660202/234745918-931e03be-26c1-4fa0-8070-a21239a63180.png)

![image](https://user-images.githubusercontent.com/97660202/234745940-c3812dfc-f3bb-4d3a-b466-8396dffcb63b.png)

เลือก limit-service-dev.properties (dev)
   
![image](https://user-images.githubusercontent.com/97660202/234745948-05baf9e5-782e-46ee-a191-71a39ee0a128.png)
![image](https://user-images.githubusercontent.com/97660202/234745969-a33d9fb0-7fb8-44c8-8b68-9a0d9052c4a5.png)

เลือก limit-service-qa (qa)

 ![image](https://user-images.githubusercontent.com/97660202/234745982-33e41bb3-ebe1-42b4-9384-c604ea145ea1.png)
![image](https://user-images.githubusercontent.com/97660202/234745988-32e1ded2-2ec8-48ca-bd73-d63d80213ecb.png)

