# College Event Registration System

## Project Team
	* Team Members: [Student 1, Student 2, Student 3]
	* Project: College Event Registration System
	* Course: Database Systems
	
## Grading & Accountability
	* The project has 3 deliverables, each due by its deadline.
	* Each submission must identify who did what.
	* Individual grades may differ from the team grade, based on contribution. 

## Project Overview
* A database system to manage registration for campus events, including event details, participant management, reporting, and basic automation of integrity rules.

## Project Structure and Deliverables

* Build a database system to manage the registration for campus events, 
	including event details, participant information, scheduling, and reporting.

### Deliverable 1: ER Modeling and Logical Design
* Entities: Student, Event, Registration, Organizer

* Relationships: 
	* Students register for Events; 
	* Events are managed by Organizers

* Attributes:
	* Student (student_id, name, email, year)
	* Event (event_id, title, date, location, capacity)
	* Registration (registration_id, student_id, event_id, status, timestamp)
	* Organizer (organizer_id, name, contact_info)

* Cardinalities: 
	* Students register for zero or many events; 
	* Events have many students; 
	* Each event managed by one organizer

* Participation Constraints: 
	* Registration requires valid student and event; 
	* Event must have at least one organizer

* ER Diagram: 
	*Show entities, attributes, keys, and relationship lines
	

### Deliverable 2: Schema & Normalization, SQL Queries & Transactions
ERD Revision: Note changes since Deliverable 1

* Normalization: Show stepwise 3NF process for each table

* SQL DDL: CREATE TABLE for all entities with PK, FK, UNIQUE, NOT NULL, CHECK

	* Primary keys auto-generated

* Triggers: e.g., enforce event capacity

* INSERTS: Sufficient demo data

* Constraints: No duplicate registration, only future events, other non-ERD constraints
	

	* At least 5 essential queries with sample results:
		* List events with registered students

		* Find students registered for multiple events

		* Show upcoming events with available slots

		* Summarize participant counts

		* Events by specific organizer

		* Show sample query scripts and outputs

* Advanced Concepts:

	* Indexes (e.g., event date, organizer)

	* View for active registrations

	* Trigger to prevent over-capacity registration

	* Stored procedure: quick registration

### Final Demo:

* Organize outputs/tables for easy presentation (1 or 2 page summary tables)




