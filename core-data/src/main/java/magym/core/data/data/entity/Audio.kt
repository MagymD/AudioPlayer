package magym.core.data.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import magym.core.common.recycler.KeyEntity

@Entity
data class Audio(
	@PrimaryKey
	override val id: Int,
	
	val index: Int,
	val genreId: Int,
	val title: String,
	val artist: String,
	val duration: Long,
	val url: String,
	val posterUrl: String
) : KeyEntity<Int>