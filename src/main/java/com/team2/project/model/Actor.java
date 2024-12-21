package com.team2.project.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="MULTI24_ACTOR")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ACTOR_NO")
	private int actorNo;
	
	@Column(name = "ACTOR_NAME", length = 30, nullable = false)
	private String actorName;
	
	@Column(name = "ACTOR_INFO", length = 4000)
	private String actorInfo;
	
	@ManyToOne
	@JoinColumn(name = "FILE_NO", referencedColumnName = "FILE_NO", insertable = false, updatable = false)
	private ShowActorFile showActorFile;
	
	@Column(name = "ACTOR_EDU", length = 50)
	private String actorEdu;
	
	@Column(name = "ACTOR_WORK", length = 2000)
	private String actorWork;
	
	@Column(name = "ACTOR_BIRTH")
	@Temporal(TemporalType.DATE)
	private Date actorBirth;
}