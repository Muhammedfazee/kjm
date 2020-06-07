INSERT INTO MEMBER (MEMBER_ID, FIRST_NAME, LAST_NAME , dob) VALUES
  (100 ,'Fazi', 'Mohd', CURRENT_TIME),
  (101,  'Alan', 'Kurian', CURRENT_TIME),
  (102, 'Riyas', 'Mohd', CURRENT_TIME);
INSERT INTO MEMBER_DETAILS (MEMBER_DETAILS_ID, phone, email , BLOOD_GROUP , MEMBER_ID) VALUES
  (201 , '123123123', 'fazi@gmail.com', 'A+' ,100),
  (202 , '987654321', 'Kurian@gmail.com', 'B+' ,101),
  (203 , '987654341', 'Mohd@gmail.com', 'O-' ,102);
INSERT INTO ADDRESS (ADDRESS_ID, ADDRESS_LINE_1, ADDRESS_LINE_2 , city , state , country ,ZIP_CODE , type , MEMBER_ID) VALUES
  (301 ,'House no 43', 'Btm Layout', 'bangalore','Karnataka','India','560076' , 'work' ,100),
  (302 ,'Kadaiyarevida', 'Koylandi', 'kozhikode','Kerala','India','686011' , 'Home' ,100);