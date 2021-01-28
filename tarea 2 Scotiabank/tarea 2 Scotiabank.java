package com.codility.tasks.hibernate.solution;

import org.springframework.data.jpa.repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;

class Task {

}

class TaskController {

}

interface TaskRepository extends JpaRepository<Task, Long> {

}
