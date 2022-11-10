package com.example.kotlingallery

interface OnItemClickListener {

    fun onClick(photo : GalleryModel)

    fun onLongClick(photo : GalleryModel)
}