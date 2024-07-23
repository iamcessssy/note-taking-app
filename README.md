# Note Taking Application

This is a simple note-taking application built with Spring Boot.

## Requirements
- Java 8
- Maven

## Setup
1. Clone the repository:
   git clone <repository-url>
   cd note-taking-app

2. Build the application:
	mvn clean install

3. Run the application:
	mvn spring-boot:run

4. The application will be available at http://localhost:8080

	**API Endpoints:
	POST /notes: Create a new note.
	GET /notes: Retrieve all notes.
	GET /notes/{id}: Retrieve a specific note by ID.
	PUT /notes/{id}: Update a specific note.
	DELETE /notes/{id}: Delete a specific note.
	
	**Error Handling
	If a note is not found, the API will return a 404 Not Found status with a message "Note not found with id: {id}".
	For other errors, the API will return a 500 Internal Server Error status with a generic error message.
	
	**Actuator Endpoints:
	Actuator endpoints will be available at http://localhost:8080/actuator.


## Testing using Postman

To add a note using the API, you need to make a 'POST' request to the '/notes' endpoint with a JSON payload that includes the title and body of the note. Here's how you can do it using an API client like Postman.

### POST
1. Open Postman.
2. Create a new 'POST' request.
3. Enter the URL: 'http://localhost:8080/notes'.
4. Set the header:
   - Key: 'Content-Type'
   - Value: 'application/json'
5. In the body tab, select 'raw' and choose 'JSON' from the dropdown.
6. Enter the JSON payload:
   {
     "title": "Sample Note Title",
     "body": "This is the body of the sample note."
   }

7. Click 'Send'.

### Example POST Response
If the note is successfully created, you will receive a '201 Created' status along with the created note in the response body:
{
  "id": 1,
  "title": "Sample Note Title",
  "body": "This is the body of the sample note."
}

This indicates that the note was successfully added to the in-memory storage, and it includes the auto-generated ID for the note.

----------------------------------------------------------
### Do the same with the other API endpoints. Use my exported Postman '/notetakingapp/src/main/resources/postman/note-taking-app.postman_collection.json' to test the other API endpoints. Just import it into the API client, and you can use the saved example API endpoint requests.

PUT
http://localhost:8080/notes/1
PUT /notes/{id}: Update a specific note.
Request Headers
Content-Type
application/json
Body
raw (json)
json
{
  "title": "Sample Note Title 1 updated",
  "body": "This is the body of the sample note 1 updated."
}

DELETE
http://localhost:8080/notes/3
DELETE /notes/{id}: Delete a specific note.

GET
http://localhost:8080/notes
GET /notes: Retrieve all notes.

GET
http://localhost:8080/notes/1
GET /notes/{id}: Retrieve a specific note by ID.

﻿
Let me know if you need any further assistance!