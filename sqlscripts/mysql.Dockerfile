FROM mysql:8.0.16
WORKDIR /docker-entrypoint-initdb.d/
ENV MYSQL_ALLOW_EMPTY_PASSWORD=true
COPY usr_usuarios_table.sql 1.sql
COPY tar_tarefas_table.sql 2.sql
COPY tar_tarefas_add_foreign_key.sql 3.sql
COPY timezone.sql 4.sql
WORKDIR /