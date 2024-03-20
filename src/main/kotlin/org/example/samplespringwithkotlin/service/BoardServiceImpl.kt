package org.example.samplespringwithkotlin.service

import org.example.samplespringwithkotlin.dto.BoardDto
import org.example.samplespringwithkotlin.entity.BoardEntity
import org.example.samplespringwithkotlin.repository.BoardRepository
import org.springframework.stereotype.Service

@Service
class BoardServiceImpl(
    private val boardRepository: BoardRepository
) : BoardService {
    override fun create(boardDto: BoardDto) {
        boardRepository.save(
            BoardEntity(
                id = boardDto.id,
                title = boardDto.title,
                content = boardDto.content
            )
        )
    }

    override fun read(id: Long): BoardDto {
        return toDto(boardRepository.findById(id).get())
    }

    override fun readAll(): List<BoardDto> {
        return boardRepository.findAll().map { toDto(it) }
    }

    override fun fixContent(boardDto: BoardDto) {
        val boardEntity: BoardEntity = boardRepository.findById(boardDto.id).get()
        boardEntity.fixContent(boardDto.title, boardDto.content)
        boardRepository.save(boardEntity)
    }

    override fun delete(id: Long) {
        boardRepository.deleteById(id)
    }

}