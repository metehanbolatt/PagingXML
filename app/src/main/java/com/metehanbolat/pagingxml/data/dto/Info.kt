package com.metehanbolat.pagingxml.data.dto

data class Info(
    val count: Int,
    val next: String?,
    val pages: Int,
    val prev: String?
)