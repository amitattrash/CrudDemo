insert into Passport (id,passport_number) values ('1','A123456');
insert into Passport (id,passport_number) values ('2','N123456');
insert into Passport (id,passport_number) values ('3','R123456');
insert into Passport (id,passport_number) values ('4','B123456');

insert into student (student_name,roll,passport_id) values('amit',1,1);
insert into student (student_name,roll,passport_id) values('neha',2,2);
insert into student (student_name,roll,passport_id) values('ravi',3,3);
insert into student (student_name,roll,passport_id) values('bhavna',4,4);


insert into course (course_id,course_name) values('c001','java');
insert into course (course_id,course_name) values('c002','spring boot');
insert into course (course_id,course_name) values('c003','microservices');
insert into course (course_id,course_name) values('c004','kafka');

insert into review (review_id,review_rating,review_comment,course_course_id) values ('R001',5,'awesome','c001');
insert into review (review_id,review_rating,review_comment,course_course_id) values ('R002',4,'nice awesome','c001');
insert into review (review_id,review_rating,review_comment,course_course_id) values ('R003',3,'good','c003');
insert into review (review_id,review_rating,review_comment,course_course_id) values ('R004',5,'very good','c003');

