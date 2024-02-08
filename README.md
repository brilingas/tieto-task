**Run the app:**
1. Clone the repo and CD into it
2. Set the environment variables (that are used in `application.properties` and `docker-compose.yml`)
3. Run the database:
   - Check if you have docker-compose: `docker-compose version`. If you dont, then install it.
   - Give needed permissions to docker: `sudo chmod -R a+rx /mnt/tieto`
   - Launch the database with some preexisting records: `docker-compose up -d`
4. (Optional). Connect your database browser
5. Run the app. I suggest to use your IDE for it and browsing your database too. For running the app from the command line you would need to have your maven version higher than 3.6.3
6. Open Postman, and make some GET requests for `localhost:8080/api/v1/`. Add request parameters `distance` and `season`. E.g. `localhost:8080/api/v1/?distance=20&season=summer`


**Things to keep in mind**
- Parameter `distance` is measured in kilometers. Lowest value is `1`.
  - Distance `1` means that the item should be carried for any distance. You can hike in the mountains and 1km can take you a long time. Those are the essential items.
  - The 20km distance indicates that a person will be spending a night outdoors.
- Parameter `season` can have the following values: `all`, `winter`, `spring`, `summer`, `autumn`.
  - Season `all` means that the item should be included all-year-round. Those are the essential items.

**Todo:**
- Add Swagger documentation