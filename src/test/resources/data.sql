insert into todo(id, username, title, description, target_date, is_done)
values
(nextval('todo_seq'), 'Mike', 'Learn JPA', 'Learn JPA in depth... Use Udemy as reference', TO_DATE('04/08/2020', 'DD/MM/YYYY'), false),
(nextval('todo_seq'), 'Mike', 'Learn Angular', 'Learn Angular in depth... Use course you already bought', TO_DATE('07/08/2020', 'DD/MM/YYYY'), false),
(nextval('todo_seq'), 'Mike', 'Learn to fligh', 'Try to learn how to fligh... Maybe Benesov letiste', TO_DATE('17/08/2020', 'DD/MM/YYYY'), false),
(nextval('todo_seq'), 'Mike', 'Visit Tom', 'Do not forget to take any present. His wife had birthday last month...', TO_DATE('17/09/2020', 'DD/MM/YYYY'), false),
(nextval('todo_seq'), 'Mike', 'Jack`s tree', 'Shopping for Jack`s cat tree... Some wood, rope, etc.', TO_DATE('27/10/2020', 'DD/MM/YYYY'), false),

(nextval('todo_seq'), 'Vesna', 'Learn JPA', 'Learn JPA in depth... Use Udemy as reference', TO_DATE('17/12/2020', 'DD/MM/YYYY'), false),
(nextval('todo_seq'), 'Vesna', 'Learn Angular', 'Learn Angular in depth... Use course you already bought', TO_DATE('17/08/2020', 'DD/MM/YYYY'), false),
(nextval('todo_seq'), 'Vesna', 'Learn to fligh', 'Try to learn how to fligh... Maybe Benesov letiste', TO_DATE('30/08/2020', 'DD/MM/YYYY'), false),
(nextval('todo_seq'), 'Vesna', 'Visit Tom', 'Do not forget to take any present. His wife had birthday last month...', TO_DATE('17/09/2020', 'DD/MM/YYYY'), false),
(nextval('todo_seq'), 'Vesna', 'Jack`s tree', 'Shopping for Jack`s cat tree... Some wood, rope, etc.', TO_DATE('05/08/2020', 'DD/MM/YYYY'), false);