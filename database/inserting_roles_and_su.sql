delete from user_roles ;


-- inserting roles

insert into user_roles(role_name, role_desc) values('superuser', 'Super user');

insert into user_roles(role_name, role_desc) values('booklender', 'user for lending books only');

insert into user_roles(role_name, role_desc) values('librarycataloger', 'user for adding updating and inserting books');

insert into user_roles(role_name, role_desc) values('libraryaccountant', 'user for adding updating and inserting charges');


-- asigning roles rights

delete from user_role_rights;

insert into user_role_rights(role_id, right_id)
select ur.role_id, ur2.right_id  from user_roles ur, user_rights ur2
where ur.role_name = 'superuser';


insert into user_role_rights(role_id, right_id)
select ur.role_id, ur2.right_id  from user_roles ur, user_rights ur2
where ur.role_name = 'booklender' and ur2.right_name in ('lendBooks', 'getBooks');


insert into user_role_rights(role_id, right_id)
    (select ur.role_id, ur2.right_id  from user_roles ur, user_rights ur2
     where ur.role_name = 'libraryaccountant'
       and ur2.right_name in ('createCharges', 'getCharges', 'updatesCharges', 'deleteCharges'));


insert into user_role_rights(role_id, right_id)
    (select ur.role_id, ur2.right_id  from user_roles ur, user_rights ur2
     where ur.role_name = 'librarycataloger'
       and ur2.right_name in ('getBooks', 'addBooks', 'deleteBooks', 'updateBooks'));



-- inseting superuser as user
set @superuser_role_id := select role_id from user_roles where role_name = 'superuser'
insert into users(username, contact, pwd, salt, is_active, role_id) values('su', 'test', 'test', 'test', 1, @superuser_role_id);

