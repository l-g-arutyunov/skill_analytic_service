mvn "-DDATASOURCE_HOST=db.bromen.fun" "-DDATASOURCE_PORT=5432" clean package
docker build . -t devlifestartup/skill_analytic_service:1.0.0
docker push devlifestartup/skill_analytic_service:1.0.0