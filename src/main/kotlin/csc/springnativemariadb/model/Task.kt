package csc.springnativemariadb.model

import javax.persistence.Entity
import org.springframework.data.jpa.domain.AbstractPersistable

@Entity
data class Task(var title: String, var description: String? = null) : AbstractPersistable<Long>()
