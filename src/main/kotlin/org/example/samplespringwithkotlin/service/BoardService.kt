package org.example.samplespringwithkotlin.service

import org.example.samplespringwithkotlin.dto.BoardDto
import org.example.samplespringwithkotlin.entity.BoardEntity


interface BoardService {

    fun create(boardDto: BoardDto)
    fun read(id:Long) : BoardDto
    fun readAll() : List<BoardDto>
    fun fixContent(boardDto: BoardDto)
    fun delete(id:Long)

    fun toDto(boardEntity: BoardEntity) : BoardDto{
        return BoardDto(
            boardEntity.id,
            boardEntity.title,
            boardEntity.content
        )
    }

}