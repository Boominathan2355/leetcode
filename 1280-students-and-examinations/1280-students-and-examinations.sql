# Write your MySQL query statement below
select students.student_id,students.student_name, s.subject_name ,count(Examinations.student_id) as attended_exams from students
cross join subjects  s
left join Examinations on students.student_id = Examinations.student_id and s.subject_name = Examinations.subject_name 
group by students.student_id, students.student_name, s.subject_name
order by students.student_id, s.subject_name