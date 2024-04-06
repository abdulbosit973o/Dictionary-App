package uz.gita.dictionary_app.presentation.UzbekDictionary

import android.database.Cursor
import com.example.enguzdictionary.data.models.WordData
import com.example.enguzdictionary.domain.AppRepository
import uz.gita.dictionary_app.domain.AppRepositoryImpl

class UzbekModel : UzbekContract.Model {
    private  val  repo: AppRepository = AppRepositoryImpl.getInstance()
    override fun getCursorFromRepo(): Cursor {
        return repo.cursor()
    }


    override fun getCursorByLikeFromRepo(query: String): Cursor {
        return  repo.cursorByLikeUzbek(query)
    }

    override fun updateData(wordData: WordData) {
        repo.updateData(wordData)
    }
}