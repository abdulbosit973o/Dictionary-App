package uz.gita.dictionary_app.presentation.home

import com.example.enguzdictionary.data.models.WordData
import uz.gita.dictionary_app.presentation.home.HomeContract
import uz.gita.dictionary_app.presentation.home.HomeModel
import java.util.concurrent.Executors

class HomePresenter(var view: HomeContract.View) : HomeContract.Presenter {
    private val model: HomeContract.Model = HomeModel()
    private val executors = Executors.newSingleThreadExecutor()


    override fun loadCursor() {
        executors.execute {
            val cursor = model.getCursorFromRepo()
            view.Cursor(cursor)
        }

    }

    override fun loadCursorByQuery(query: String) {
        executors.execute {
            val cursor = model.getCursorByLikeFromRepo(query)
            view.Cursor(cursor)
        }
    }

    override fun updateData(it: WordData) {
        executors.execute {
            model.updateData(it)
//            loadCursor()
        }

    }
}