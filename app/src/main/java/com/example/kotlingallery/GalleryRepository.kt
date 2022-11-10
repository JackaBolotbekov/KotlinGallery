package com.example.kotlingallery

class GalleryRepository {
    companion object {
        private val galleryList = mutableListOf<GalleryModel>()
    }
    fun getPhotos(): List<GalleryModel> {
        galleryList.add(
            GalleryModel(
                1,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5TMaxXj2yNNb1mZzq9_EUm8lmW7Qz91yFKkF2NqKLhNoQaoDuh88YrQECDio8CNfwnhI&usqp=CAU"
            )
        )
        galleryList.add(
            GalleryModel(
                2,
                "https://img2.akspic.ru/crops/9/0/1/9/6/169109/169109-anime_pejzazh-anime-pejzazhnaya_zhivopis-art-peyzash-1920x1080.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                3,
                "https://img1.akspic.ru/crops/8/1/9/7/6/167918/167918-anime_pejzazh-anime-pejzazhnaya_zhivopis-zhivopis-art-3840x2160.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                4,
                "https://i.pinimg.com/736x/f6/4d/61/f64d61b8efc44ae7fd86800546f64363--computer-art-wallpaper-art.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                5,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2pf-8K1qxMYp3u3XtWTj5FHC1xVpNWv2CHi7piEJSYZRnektzcDmG-qzIsiDqeT-KgCU&usqp=CAU"
            )
        )
        galleryList.add(
            GalleryModel(
                6,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVdk1V2DK6GjbE0M3l4zWJLFN8hQXB8rLpF4usvR1M9Qm3O5Db3RZQhmW0sT1Foi3TBcg&usqp=CAU"
            )
        )
        galleryList.add(
            GalleryModel(
                7,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQe3izcwFrWKg81xFg7L7qC9jXxaWReqpK-YQQemsCMxmXGJOzbMwFfgDIXDW0gteZDrGQ&usqp=CAU"
            )
        )
        galleryList.add(
            GalleryModel(
                8,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-8fZrOFs3US3CyTbVK8VnKtc0H4j13AfbE89ZIyfUesjTXDCgi9ZL7sHSpHcBE1d9RZE&usqp=CAU"
            )
        )
        galleryList.add(
            GalleryModel(
                9,
                "https://99px.ru/sstorage/53/2014/05/mid_101943_5407.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                10,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTh6iBfny6Qz3N3eGWk4_zdAc4gsXR5tApsnnOOOsGjx455AFconr-PJRNu4W8--Ug3GeI&usqp=CAU"
            )
        )
        return galleryList
    }
}