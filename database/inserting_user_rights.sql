delete from user_rights;

insert into user_rights(right_name, right_desc) values('createUsers', 'Creating user');
insert into user_rights(right_name, right_desc) values('getUsers', 'Reading user');
insert into user_rights(right_name, right_desc) values('updateUsers', 'Updating user');
insert into user_rights(right_name, right_desc) values('deleteUser', 'Deleting user');


insert into user_rights(right_name, right_desc) values('createCharges', 'Creating charge type');
insert into user_rights(right_name, right_desc) values('getCharges', 'Reading charge type');
insert into user_rights(right_name, right_desc) values('updatesCharges', 'Updating charge type');
insert into user_rights(right_name, right_desc) values('deleteCharges', 'Deleting charge type');


insert into user_rights(right_name, right_desc) values('addBooks', 'Creating books');
insert into user_rights(right_name, right_desc) values('getBooks', 'Reading books');
insert into user_rights(right_name, right_desc) values('updateBooks', 'Updating books');
insert into user_rights(right_name, right_desc) values('deleteBooks', 'Deleting books');


insert into user_rights(right_name, right_desc) values('addMembers', 'Creating Members');
insert into user_rights(right_name, right_desc) values('getMembers', 'Reading Members');
insert into user_rights(right_name, right_desc) values('updateMembers', 'Updating Members');
insert into user_rights(right_name, right_desc) values('deleteMembers', 'Deleting Members');


insert into user_rights(right_name, right_desc) values('addRoles', 'Creating Roles');
insert into user_rights(right_name, right_desc) values('getRoles', 'Reading Roles');
insert into user_rights(right_name, right_desc) values('updateRoles', 'Updating Roles');
insert into user_rights(right_name, right_desc) values('deleteRoles', 'Deleting Roles');


insert into user_rights(right_name, right_desc) values('addRights', 'Creating Rights');
insert into user_rights(right_name, right_desc) values('getRights', 'Reading Rights');
insert into user_rights(right_name, right_desc) values('updateRights', 'Updating Rights');
insert into user_rights(right_name, right_desc) values('deleteRights', 'Deleting Rights');



insert into user_rights(right_name, right_desc) values('assignRoles', 'Assigning roles');


insert into user_rights(right_name, right_desc) values('lendBooks', 'Lending books to members');


insert into user_rights(right_name, right_desc) values('postCharge', 'Posting charge on members');


insert into user_rights(right_name, right_desc) values('sellBooks', 'Selling books');
