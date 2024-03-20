package org.example.samplespringwithkotlin.repository

import org.example.samplespringwithkotlin.entity.BoardEntity
import org.springframework.data.repository.CrudRepository

interface BoardRepository : CrudRepository<BoardEntity, Long> {
}