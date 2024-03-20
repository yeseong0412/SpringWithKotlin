package org.example.samplespringwithkotlin.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity

class BoardEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column
    var title : String,

    @Column
    var content : String)
{

    fun fixContent(title: String, content: String){
        this.title=title
        this.content=content
    }

}