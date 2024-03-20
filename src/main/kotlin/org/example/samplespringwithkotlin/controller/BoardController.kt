package org.example.samplespringwithkotlin.controller

import org.example.samplespringwithkotlin.dto.BoardDto
import org.example.samplespringwithkotlin.service.BoardService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")

class BoardController(
    private val boardService: BoardService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(
        @RequestBody boardDto: BoardDto
    ){
        boardService.create(boardDto)
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getContent(
        @PathVariable id: Long
    ): BoardDto{
        return boardService.read(id)
    }

    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    fun getContents() : List<BoardDto>{
        return boardService.readAll()
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    fun delete(
        @RequestParam("{id}") id: Long
    ) {
        boardService.delete(id)
    }
}